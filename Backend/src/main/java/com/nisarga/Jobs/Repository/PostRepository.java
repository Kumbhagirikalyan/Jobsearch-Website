package com.nisarga.Jobs.Repository;

import com.nisarga.Jobs.modal.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
