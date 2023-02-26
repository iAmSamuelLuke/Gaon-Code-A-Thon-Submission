package com.example.codeathon.service;

import com.example.codeathon.domain.Users;
import com.example.codeathon.repository.UsersRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsersService {

    private final UsersRepository usersRepository;
    @Transactional
    public Users create(Users users) {
        return usersRepository.save(users);
    }

    @Transactional
    public Users setXP(Users user){
        String uname = user.getUsername();
        Users user1 = usersRepository.findByUsername(uname);
        Integer u1 = user.getXp() + 5;
        user1.setXp(u1);

        usersRepository.save(user1);

        return user;
    }

    @Transactional
    public Users setCoins(Users user){
        String u_name = user.getUsername();
        Users user1 = usersRepository.findByUsername(u_name);
        Integer curr_coins = user1.getCoins();

        Integer curr_Xp = user1.getXp();

        Integer coin_amt = curr_Xp / 125;
        user1.setCoins(curr_coins + coin_amt);
        usersRepository.save(user1);
        return user;
    }
}
