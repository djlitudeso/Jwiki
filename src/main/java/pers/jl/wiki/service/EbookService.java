package pers.jl.wiki.service;

import pers.jl.wiki.dto.req.EbookReq;
import pers.jl.wiki.mbg.entity.Ebook;

import java.util.List;

/**
 * @author: JL Du
 * @date: 2022/2/28 22:24
 * @version: 1.0.0
 */
public interface EbookService {

    List<Ebook> listAllEbook();

    List<Ebook> getEbookBy(EbookReq ebookReq);
}
