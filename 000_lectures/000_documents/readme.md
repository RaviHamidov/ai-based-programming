# ai-based-java-engineer

<!-- topic_000 -->

## git-github-usage

> It's just a tool for manage your works, documents, codes etc.

### Simple git commands for push your information to the remote repository

- `git add .`
  - This command help us to move our works to the `stagingArea` and these works are resting while waiting for the comment to be given to them, Example: `git add index.html`
- `git status`
  - This command every time answers your questions, about the git procsess for example: this command help you now that which files are tracked or which file are untracked
- `git commit -m "your comment"`
  - This command helps us to give some comments to the our works at remote repository, Example: `git commit -m "Today i'm not do eat something about gym`
- `git remote add origin ( remote repository link )`
  - This command help us to establish communication between LocalRepository & RemoteRepository
- `git branch -M main`
  - This command help us to change our brachName for example your local branch is a `master` but remote branch is `main` you need change local branch because local branch & remote branch's name should be the same
- `git push origin main`
  - This command helps you to push your works to the remote repository

<div style="width:100vw; heigth:200px; display: flex; justify-content: start; align-items: center; margin-top:3rem; ">
    <img style="width:60vw;" src="../../002_storage/000_git-structure.png" alt="GitStructure"/>
</div>

<!-- topic_002 -->

## data-types

> It's just a storage for collect your information's in storage

- Data types divided to

  - Primitive types

    - byte
    - short
    - int
    - long
    - float
    - double

  - Reference types
    - String
    - Classes
    - Arrays

- Type conversion - changing formats

  - Implicit conversion

    - `int number = 100`
    - `double decimal = number` // becomes 100.0 automaticly

  - Explicit conversion

    - `double salary = 234.999`
    - `int number = int (salary)` // become 234 automaticliy

<!-- topic_003 -->
