package run.halo.app.repository;

import run.halo.app.model.entity.SheetComment;
import run.halo.app.repository.base.BaseCommentRepository;

/**
 * Sheet comment repository.
 *
 * @author johnniang
 * @date 19-4-24
 */
public interface SheetCommentRepository extends BaseCommentRepository<SheetComment> {
//
//    @Query("select new run.halo.app.model.projection.CommentCountProjection(count(comment.id), comment.postId) from SheetComment comment where comment.postId in ?1 group by comment.postId")
//    @NonNull
//    @Override
//    List<CommentCountProjection> countByPostIds(@NonNull Iterable<Integer> postIds);
}
