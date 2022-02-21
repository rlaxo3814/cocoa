package mc.sn.cocoa.dao;

import java.util.List;

import mc.sn.cocoa.vo.Criteria;
import mc.sn.cocoa.vo.ReviewVO;

public interface ReviewDAO {

	public int insertReview(ReviewVO reviewVO);

	public List selectByTarget(Criteria cri);

	public ReviewVO selectReview(int reviewNO);

	public void updateReview(ReviewVO reviewVO);

	public void deleteReview(ReviewVO reviewVO);

	public int countReview(String target);

	public List selectTargets();

	public int selectReCountByTarget(String key);

	public float selectReAvgByTarget(String key);
}