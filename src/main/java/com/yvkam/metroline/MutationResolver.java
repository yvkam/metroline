package com.yvkam.metroline;

import com.yvkam.metroline.support.Comment;
import com.yvkam.metroline.support.CommentInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class MutationResolver implements GraphQLMutationResolver {

    public Comment addComment(CommentInput commentInput) {
        log.info("Comment saved: value = {}, date = {}", commentInput.getValue(), commentInput.getDate());
        return commentInput;
    }
}
