package com.barcode.uniplo.dao;

import com.barcode.uniplo.domain.ItemDto;

import java.util.List;

public interface ItemDao {
    void insertItem(ItemDto item);

    List<ItemDto> selectAllItems();
    public ItemDto selectItemById(Integer item_id);

    // 추가
    // 아이템 단품 가격 조회
    int getPriceByItemId(int id);

    public List<ItemDto> findByGenderCode(String genderCode);

}


