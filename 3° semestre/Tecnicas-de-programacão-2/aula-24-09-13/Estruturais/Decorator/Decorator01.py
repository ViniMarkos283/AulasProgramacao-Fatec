class ComponenteNotificador:
    def enviar(self, msg):
        print(f'Enviando Mensagem: {msg}')

class DecoradorNotificador:
    def __init__(self, componente):
        self.componente = componente
    def enviar(self, msg):
        self.componente.enviar(msg)

class NotificadorSMS(DecoradorNotificador):
    def enviar(self, msg):
        super().enviar(msg)
        print(f'Enviando mensagem por SMS: {msg}')

class NotificadorWhatsApp(DecoradorNotificador):
    def enviar(self, msg):
        super().enviar(msg)
        print(f'Enviando mensagem por WhatsApp: {msg}')

class NotificadorEmail(DecoradorNotificador):
    def enviar(self, msg):
        super().enviar(msg)
        print(f'Enviando mensagem por Email: {msg}')

notificador = ComponenteNotificador()
notificadorSMS =  NotificadorSMS(notificador)
notificadorWhatsApp = NotificadorWhatsApp(notificador)
notificadorEmail = NotificadorEmail(notificador)

mensagem = "Olá mundo, através do Python"
notificadorWhatsApp.enviar(mensagem)
notificadorEmail.enviar(mensagem)
notificadorSMS.enviar(mensagem)
