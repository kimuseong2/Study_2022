package site.sinsauseong.service;

import java.util.List;

import site.sinsauseong.domain.BoardVo;
import site.sinsauseong.domain.Criteria;

public interface BoardService {

	public void register(BoardVo board);

	public BoardVo get(Long bno);

	public boolean modify(BoardVo board);

	public boolean remove(Long bno);

	public List<BoardVo> getList();

	public List<BoardVo> getList(Criteria cri);

	//추가
	public int getTotal(Criteria cri);

}
