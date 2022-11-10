package com.example.demo.write;

import com.example.demo.member.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryWriteRepository implements WriteRepository{

    private static Map<Long, Write> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Write save(Write write){
        write.setWriteId(++sequence);
        store.put(write.getWriteId(),write);
        return write;
    }

    @Override
    public Write findById(Long writeId) {
        return store.get(writeId);
    }

    @Override
    public List<Write> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void update(Long writeId, Write updateWrite) {
        Write findWrite = findById(writeId);
        findWrite.setTitle(updateWrite.getTitle());
        findWrite.setContent(updateWrite.getContent());
    }

    @Override
    public void delete(Long writeId) {
        store.remove(writeId);
    }


}
