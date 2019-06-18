package com.biz.word.exec;

import java.io.FileNotFoundException;

import com.biz.word.service.WordService;

public class WordExec_02 {

	public static void main(String[] args) {
		String scoreFile="src/com/biz/word/exec/word.txt";
		WordService ws;
		try {
			ws = new WordService(scoreFile);
			while(true) {
				ws.readWordList();
				ws.makeQuiz();
				if(ws.pickQuiz()) break;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
