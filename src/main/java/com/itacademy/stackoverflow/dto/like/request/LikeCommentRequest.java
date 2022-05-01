package com.itacademy.stackoverflow.dto.like.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LikeCommentRequest {
    Long userId;

    Long commentId;
}
