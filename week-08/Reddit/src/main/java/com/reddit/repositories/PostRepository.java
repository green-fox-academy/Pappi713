package com.reddit.repositories;

import com.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface PostRepository extends CrudRepository<Post,Long> {

}
