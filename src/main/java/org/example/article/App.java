package org.example.article;

import org.example.article.system.SystemController;
import java.util.Scanner;

public class App {
    ArticleController articleController;
    SystemController systemController;

    App () {
        articleController = new ArticleController();
        systemController = new SystemController();
    }

    public void run () {
        System.out.println("== 게시판 앱 ==");
        while (true) {
            System.out.print("명령) ");
            String command = Container.getSc().nextLine().trim();
            Requsest requsest = new Requsest(command);


            if (command.equals("종료")) {
                systemController.exit();
                break;
            } else if (requsest.getActionCode().equals("등록")) {
                articleController.write();
            } else if (requsest.getActionCode().equals("목록")) {
                articleController.list();
            } else if (requsest.getActionCode().startsWith("삭제")) {
                articleController.delete(requsest.getIdx());
            } else if (requsest.getActionCode().startsWith("수정")) {
                articleController.modify(requsest.getIdx());
            }
        }
    }
}