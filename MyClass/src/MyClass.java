/**
 * Created by Andrey on 20.12.2016.
 */
public class MyClass {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("world");
        System.out.println("everybody");
        System.out.println("1");
        System.out.println("what's up");

        System.out.println("Console commands for git: ");
        System.out.println("git clone URL.git"); // clone repository
        System.out.println("git status"); // shows changes
        System.out.println("git add FILENAME.ext"); // add new file
        System.out.println("git status"); // shows changes (changes to be commited)
        System.out.println("git commit -a -m \"MESSAGE\""); // do commit (all files) to local repository
        System.out.println("git push origin"); // push to remote repository

        System.out.println("git branch -a"); // show current branches
        System.out.println("git branch BRANCH"); // add new branch
        System.out.println("git checkout BRANCH"); // go to other branch
        System.out.println("git add FILENAME.ext"); // add new file
        System.out.println("git status"); // shows changes (changes to be commited)
        System.out.println("git commit -a -m \"MESSAGE\""); // do commit (all files) to local repository
        System.out.println("git push origin BRANCH"); // push to remote repository branch
        // changes in BRANCH to master
        System.out.println("git checkout master");
        System.out.println("git merge love"); // merging
        System.out.println("git push origin"); // save to remote repository (merged branch)
        System.out.println("git branch -d BRANCH"); // delete branch in local repository
        System.out.println("git push origin --delete BRANCH"); // delete branch in remote repository


    }
}
