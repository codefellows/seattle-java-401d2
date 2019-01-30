# Lecture 43: Accessibility

## Agenda
- Announcements
    - Round 2 of whiteboarding is coming on Friday/Monday/Tuesday
        - Rounds 3 and on will be more ad-hoc
    - Tomorrow will be payments, Friday I'll probably yell about dependency injection
- Code review
    - TaskManager/Firebase: how goes it?
- Let People Use Your Apps
    - what does accessibility mean
    - how do we do it
    - how do we test it
        - playing with TalkBack
        - the Accessibility Scanner
- End early for whiteboard code challenge

## Specific Important Accessibility Pieces

- Any iconography in your app should be well-labeled with a `contentDescription`.
- Use the `hint` attribute on all editable elements in your app, or `labelFor` to allow a TextView to serve as a label.
- Use the `focusable` attribute to show that a particular ViewGroup consists of one piece of data.

## Testing for Accessibility
- Test manually using TalkBack to ensure your app is navigable through that interface.
- Use the [Accessibility Scanner](https://support.google.com/accessibility/android/answer/6376570) to run automated testing.
- Enable [AccessibilityChecks](https://developer.android.com/reference/android/support/test/espresso/accessibility/AccessibilityChecks) on your Espresso tests.
