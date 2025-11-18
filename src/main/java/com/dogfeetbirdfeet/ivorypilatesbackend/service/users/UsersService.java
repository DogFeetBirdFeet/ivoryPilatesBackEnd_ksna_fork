package com.dogfeetbirdfeet.ivorypilatesbackend.service.users;

import com.dogfeetbirdfeet.ivorypilatesbackend.dto.searchdto.CusSearchDto;
import com.dogfeetbirdfeet.ivorypilatesbackend.mapper.users.UsersMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersMapper usersMapper;

    public UsersService(final UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    /**
     * 이름과 연락처에 해당하는 회원목록을 조회한다.
     *
     * @author swo
     * @param name 고객명 contact 연락처
     * @return 계정 정보
     */
    public List<CusSearchDto> getCusSearch(String name, String contact, String flag) {

        return usersMapper.getCusSearch(name, contact, flag);
    }
}
