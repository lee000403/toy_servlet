-- 설문자 

INSERT INTO RESPONDENTS
(respondents, respondents_ID, PASSWORD)
VALUES
('홍길동', 'R-01', '0011'),
('장길산', 'R-02', 'sads'),
('신사임당', 'R-03', '5691'),
('김철수', 'R-04', 'ds12');


-- 설문 문항 
INSERT INTO QUESTIONS
(questions, questions_ID)
VALUES
('1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?', 'Q-01'),
('2. 강의의 내용은 체계적이고 성의있게 구성되었는가?', 'Q-02'),
('3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?', 'Q-03'),
('4. 강의 진행 속도는 적절하였는가?', 'Q-04'); 


-- 설문 답항 
INSERT INTO CHOICE
(choice, choice_ID)
VALUES
('(1)전혀 아니다', 'C-01'),
('(2)아니다', 'C-02' ),
('(3)그렇다', 'C-03' ),
('(4)매우그렇다', 'C-04' );

-- 문답
INSERT INTO question_choice
(QUESTIONS_ID, CHOICE_ID)
VALUES
('Q-01', 'C-01'),
('Q-01', 'C-02'),
('Q-01', 'C-03'),
('Q-01', 'C-04'),
('Q-02', 'C-01'),
('Q-02', 'C-02'),
('Q-02', 'C-03'),
('Q-02', 'C-04'),
('Q-03', 'C-01'),
('Q-03', 'C-02'),
('Q-03', 'C-03'),
('Q-03', 'C-04'),
('Q-04', 'C-01'),
('Q-04', 'C-02'),
('Q-04', 'C-03'),
('Q-04', 'C-04');

-- 설문 통계
INSERT INTO statistics
(STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID)
VALUES
('S-01', 'R-01', 'Q-01', 'C-01'),
('S-02', 'R-01', 'Q-02', 'C-01'),
('S-03', 'R-01', 'Q-03', 'C-01'),
('S-04', 'R-01', 'Q-04', 'C-01'),
('S-05', 'R-02', 'Q-01', 'C-01'),
('S-06', 'R-02', 'Q-02', 'C-01'),
('S-07', 'R-02', 'Q-03', 'C-01'),
('S-08', 'R-02', 'Q-04', 'C-01'),
('S-09', 'R-03', 'Q-01', 'C-01'),
('S-10', 'R-03', 'Q-02', 'C-01'),
('S-11', 'R-03', 'Q-03', 'C-01'),
('S-12', 'R-03', 'Q-04', 'C-01'),
('S-13', 'R-04', 'Q-01', 'C-01'),
('S-14', 'R-04', 'Q-02', 'C-01'),
('S-15', 'R-04', 'Q-03', 'C-01'),
('S-16', 'R-04', 'Q-04', 'C-01');