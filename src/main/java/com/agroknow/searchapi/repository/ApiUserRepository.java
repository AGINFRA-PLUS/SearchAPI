package com.agroknow.searchapi.repository;

import com.agroknow.searchapi.model.domain.ApiUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface ApiUserRepository extends ElasticsearchRepository<ApiUser, String> {

    Optional<ApiUser> findAllByApiKey(String apiKey);

    Optional<ApiUser> findAllByUsernameAndPasswordAndRegisteredFor(String username, String password, String registedFor);

}
