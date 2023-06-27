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
('1. 이 수업에 대해 전반적으로 만족하십니까?', 'Q-01'),
('2. 강의계획서에 수업내용 및 목표와 평가방법이 자세하게 안내되었습니까?', 'Q-02'),
('3. 개강 초 수업에 대한 안내 혹은 오리엔테이션에 충실히 이루어졌습니까?', 'Q-03'),
('4. 대학원 학습 환경과 자료 제공은 만족스러웠나요?', 'Q-04'); 


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