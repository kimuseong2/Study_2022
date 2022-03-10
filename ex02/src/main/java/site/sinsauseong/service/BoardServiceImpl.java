package site.sinsauseong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import site.sinsauseong.domain.BoardVo;
import site.sinsauseong.domain.Criteria;
import site.sinsauseong.mapper.BoardMapper;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	@Override
	public void register(BoardVo board) {

		log.info("register......" + board);

		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVo get(Long bno) {

		log.info("get......" + bno);

		return mapper.read(bno);

	}

//	@Override
//	public boolean modify(BoardVo board) {
//		return false;
//	}

	@Override
	public boolean modify(BoardVo board) {

		log.info("modify......" + board);

		return mapper.update(board) == 1;
	}

	@Override
	public boolean remove(Long bno) {

		log.info("remove...." + bno);

		return mapper.delete(bno) == 1;
	}



	 @Override
	 public List<BoardVo> getList() {

	 log.info("getList..........");

	 return mapper.getList();
	 }

	@Override
	public List<BoardVo> getList(Criteria cri) {

		log.info("get List with criteria: " + cri);

		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {

		log.info("get total count");
		return mapper.getTotalCount(cri);
	}

}
