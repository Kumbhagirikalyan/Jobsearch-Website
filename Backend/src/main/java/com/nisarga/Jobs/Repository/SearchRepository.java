package com.nisarga.Jobs.Repository;

import com.nisarga.Jobs.modal.Post;

import java.util.List;

public interface SearchRepository
{
     List<Post> findBySearch(String text);

}
