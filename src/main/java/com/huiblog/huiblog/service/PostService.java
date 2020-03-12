package com.huiblog.huiblog.service;

import com.huiblog.huiblog.model.dto.Paging;
import com.huiblog.huiblog.model.dto.PostDTO;
import com.huiblog.huiblog.model.request.CreatePostReq;
import com.huiblog.huiblog.model.request.UpdatePostReq;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    Paging getListPost(int page);

    PostDTO getPostByID(int postID);

    PostDTO createPost(CreatePostReq createPostReq);

    PostDTO updatePost(UpdatePostReq updatePostReq, int postID);

    void deletePost(int postID);
}
