# Lecture 44: Payments

## Agenda
- Announcements
    - Round 2 of whiteboarding has been scheduled!
        - If you need a Round 3, reach out to me directly for scheduling.
- Code review
    - TaskManager/Firebase/accessibility: how goes it?
- Get Paid
    - Big Option One: show ads with [AdMob](https://firebase.google.com/docs/admob/android/quick-start)
    - Big Option Two: get payments from users
      - The tools involved: payments processors, card collection, etc
      - Taking Payments 1: your app costs money to download on the Play Store
          - By far the easiest: requires writing no code
          - Managed through the Play Console
          - Drives down install rates by a lot
          - Google takes 30%
      - Taking Payments 2: using [In-App Billing](https://developer.android.com/google/play/billing/billing_library_overview)
          - required for "in-app products", like removing ads or subscribing to a magazine
          - somewhat complicated
          - "strongly recommended" to verify purchases on a server
          - Google takes 30%
      - Taking Payments 3: [Stripe](https://stripe.com/docs/mobile/android) as a payments processor (and optionally Google Pay for taking credit cards)
          - Can only use it for "physical goods or services"
          - Stripe takes 30 cents plus 2.8% for each transaction
          - like Firebase, it helps with the UI and has GREAT docs
          - Stripe handles web, iOS, and Android all extremely well
          - requires a server (or cloud function...) for making the final payment request
          - the most complicated
- End early for whiteboard code challenge
