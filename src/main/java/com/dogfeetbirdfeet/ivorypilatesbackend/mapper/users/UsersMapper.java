package com.dogfeetbirdfeet.ivorypilatesbackend.mapper.users;

import com.dogfeetbirdfeet.ivorypilatesbackend.dto.searchdto.CusSearchDto;

import java.util.List;

public interface UsersMapper {
    /**
     * 회원검색
     *
     * @author swo
     * @return 회원목록
     */
    List<CusSearchDto> getCusSearch(String name, String contact, String flag);
}
