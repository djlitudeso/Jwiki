package pers.jl.wiki.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jl.wiki.dto.req.EbookReq;
import pers.jl.wiki.mbg.entity.Ebook;
import pers.jl.wiki.mbg.entity.EbookExample;
import pers.jl.wiki.mbg.mapper.EbookMapper;
import pers.jl.wiki.service.EbookService;

import java.util.List;

/**
 * @author: JL Du
 * @date: 2022/2/28 22:27
 * @version: 1.0.0
 */
@Service
public class EbookServiceImpl implements EbookService {

    @Autowired
    private EbookMapper ebookMapper;
    @Override
    public List<Ebook> listAllEbook() {
        return ebookMapper.selectByExample(new EbookExample());
    }

    @Override
    public List<Ebook> getEbookBy(EbookReq ebookReq) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        ebookReq.setId(3L);
        criteria.andNameLike("%"+ebookReq+"%");
        return ebookMapper.selectByExample(new EbookExample());
    }
}
