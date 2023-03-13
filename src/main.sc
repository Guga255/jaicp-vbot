require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Vamos começar.

    state: Hello
        intent!: /hello
        a: Olá

    state: Bye
        intent!: /bye
        a: Tchau

    state: KnowledgeBase
        intentGroup!: /KnowledgeBase
        script: $faq.pushReplies();

    state: NoMatch
        event!: noMatch
        a: Eu não entendo. Você disse: {{$request.query}}
