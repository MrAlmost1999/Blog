package com.mralmost.community.service;

import com.mralmost.community.date.DateFormat;
import com.mralmost.community.mapper.RecordMapper;
import com.mralmost.community.model.Record;
import com.mralmost.community.model.RecordExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Lxj
 * @Package com.mralmost.community.service
 * @Description TODO
 * @date: 2020/1/24
 */
@Service
public class RecordService {

    @Autowired
    private RecordMapper recordMapper;

    /**
     * 根据用户id和问题id查询是否有该记录
     *
     * @param record
     * @return 有则返回true, 没有则false
     */
    public boolean select(Record record) {
        RecordExample example = new RecordExample();
        example.createCriteria().andUserIdEqualTo(record.getUserId()).andQuestionIdEqualTo(record.getQuestionId());
        List<Record> records = recordMapper.selectByExample(example);
        if (records.size() == 0) {
            return false;
        }
        return true;
    }

    /**
     * 插入或修改浏览记录,当用户未登录时不做任何操作
     *
     * @param record
     * @return 查到了执行修改返回true, 没有查到执行插入返回false
     */
    public boolean insertOrUpdate(Record record) {
        boolean flag = select(record);
        if (flag) {
            RecordExample example = new RecordExample();
            example.createCriteria().andRecordTimeEqualTo(DateFormat.dateFormat(new Date()));
            recordMapper.updateByExampleSelective(record, example);
            return true;
        } else {
            recordMapper.insert(record);
            return false;
        }
    }
}
