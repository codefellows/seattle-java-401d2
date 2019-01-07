# Partner Code Review

## Background
Presentations are one great capstone to a project, but they're not the only way you'll need to talk about your work in the future! Several CodeFellows grads have said that the interview type they were *least* prepared for was an interview in which they needed to walk an engineer through one of their past projects. So, let's take some time today to practice that skill, and also to take a deeper dive into one of your classmates' projects.

## Overview

You'll each take one hour to be the presenter/code author, and one hour to be the code reviewer/interviewer. (You can take a 10 minute break between these.) **You should take the full hour with each person**--if you run out of things to talk about, then you haven't gone in-depth enough on the code. These projects are large, and there should be a lot to look at and talk about!

### As the presenter/code author

Before you begin, check out a new branch for any comments/modifications/feedback that you write during the review.

You should start with a quick demo of your application, running locally on your machine. Then, you should open up the code in your IDE and walk your partner through it. There's no one right order in which to do this walkthrough, but here are some ideas:
- start by listing out the routes that exist, and then dive into the code at each of those routes
- start with the models that exist, then look at the routes associated with each model
- start with the views, then move to the controllers that use those views

No matter how you organize your walkthrough, you should talk your partner through all of the following:
- all of your models
- all of your controllers
- all of your tests
- at least some of your views
- any frontend JS
- anything else "interesting" about your app

As you receive questions/feedback from your reviewer, you should add comments in your code with any good/interesting feedback from your reviewer. You should also feel free to modify the code with your reviewer, rerun, and see what's changed: this should be a very interactive experience!

### As the reviewer/interviewer
You should be actively listening and interrupting with questions and feedback. This should be a learning experience for you, as you get to explore an app architecture different from your own.

Anytime that you don't understand what your partner just explained, PLEASE ask them to explain it again! This is a good opportunity for your partner to practice their explanation ability.

Some general things to look for/ask about:
- why did you organize your code/classes/methods/functionality in this way?
- how did you learn about this \[library/method/design pattern/technique\]?
- why did you name your variables/methods in this way? I would think of this as being named \[other way\].
- how did your team divide the work? which parts of the code are most familiar to you? (then, feel free to ask them lots of questions about the code that they worked on least--you should be able to explain every part of your app!)
- which parts of your code feel hacky/buggy to you? can we try to work through those bugs now, live, together? (this will happen in almost every interview of this style!)
- point out anywhere that's missing comments, or where their explanation is particularly necessary to understand how the app works.

Note that for all of those questions, *it is okay to ask the question even if you are wrong*--that's how good discussions start! You should be interrupting with a question *at least every 2 minutes*. This is a conversation, not a one-sided presentation.

