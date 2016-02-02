package net.stigmod.service;

//import org.neo4j.cineasts.domain.Movie;
//import org.neo4j.cineasts.domain.Rating;
import net.stigmod.domain.node.User;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mh
 * @since 08.11.11
 */
public interface StigmodUserDetailsService extends UserDetailsService {
    @Override
    StigmodUserDetails loadUserByUsername(String login) throws UsernameNotFoundException, DataAccessException;

    User getUserFromSession();

//    @Transactional
//    Rating rate(Movie movie, User user, int stars, String comment);

    @Transactional
    User register(String name, String mail, String password, String passwordRepeat);

//    @Transactional
//    void addFriend(String login, final User userFromSession);
}
