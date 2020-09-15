package com.dao;

import com.po.ThumbedAnswer;

public interface ThumbedAnswerDao {

	public ThumbedAnswer selectThumb(ThumbedAnswer thumbedAnswer);

	public int thumb(ThumbedAnswer thumbedAnswer);

}
