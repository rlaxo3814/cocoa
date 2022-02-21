package mc.sn.cocoa.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mc.sn.cocoa.vo.MemberVO;

public interface MemberController {
	// 참여자 조인 입력
	public ModelAndView view_join(HttpServletRequest request, HttpServletResponse response);
	//참여자 입력
	public int join(@ModelAttribute("member") MemberVO memberVO, HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException;
	//로그인 입력
	public ModelAndView view_login(@RequestParam(value = "result", required = false) String result,
			@RequestParam("view") String view, HttpServletRequest request, HttpServletResponse response);
	//가입한 사람 로그인 입력 
	public ModelAndView login(@ModelAttribute("member") MemberVO member, RedirectAttributes rAttr,
			HttpServletRequest request, HttpServletResponse response);
	//로그 아웃 입력
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response);
	//마이페이지 프로필 입력
	public ModelAndView view_myPageProfile(HttpServletRequest request, HttpServletResponse response) throws Exception;
	//멤버 정보 입력
	public ModelAndView view_memberInfo(HttpServletRequest request, HttpServletResponse response);

}