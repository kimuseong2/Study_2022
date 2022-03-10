package site.sinsauseong.mapper;

import site.sinsauseong.domain.BoardVo;
import site.sinsauseong.domain.Criteria;

import java.util.List;

public interface BoardMapper {

    public List<BoardVo> getList();

    public List<BoardVo> getListWithPaging(Criteria cri);

    public void insert(BoardVo board);

    public Integer insertSelectKey(BoardVo board);

    public BoardVo read(Long bno);

    public int delete(Long bno);

    public int update(BoardVo board);

    public int getTotalCount(Criteria cri);
}
