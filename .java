class GerenciadorTopicos:
    def __init__(self):
        self.topicos = {}

    def criar_topico(self, nome, conteudo):
        self.topicos[nome] = conteudo
        print(f"Tópico '{nome}' criado com sucesso.")

    def listar_topicos(self):
        print("Tópicos disponíveis:")
        for nome, _ in self.topicos.items():
            print(nome)

    def mostrar_topico(self, nome):
        if nome in self.topicos:
            print(f"Conteúdo do tópico '{nome}':")
            print(self.topicos[nome])
        else:
            print(f"O tópico '{nome}' não existe.")

    def atualizar_topico(self, nome, novo_conteudo):
        if nome in self.topicos:
            self.topicos[nome] = novo_conteudo
            print(f"Tópico '{nome}' atualizado com sucesso.")
        else:
            print(f"O tópico '{nome}' não existe.")

    def eliminar_topico(self, nome):
        if nome in self.topicos:
            del self.topicos[nome]
            print(f"Tópico '{nome}' eliminado com sucesso.")
        else:
            print(f"O tópico '{nome}' não existe.")