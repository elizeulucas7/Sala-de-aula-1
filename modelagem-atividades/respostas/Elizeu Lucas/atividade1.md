# Atividade 1 — Engenharia de Requisitos

# Estudo de Caso 1 — Conecta Campus

## 1. Concepção

O Conecta Campus pretende resolver as dificuldades de acesso às informações acadêmicas, pois o sistema atual é lento e difícil de usar. Seu objetivo é reunir notas, horários, avisos, materiais e eventos em uma única plataforma, facilitando a comunicação entre alunos, professores e universidade.

## 2. Elicitação

**Stakeholders:**
- **Alunos:** consultar notas, horários e avisos.
- **Professores:** publicar materiais e comunicados.
- **Universidade:** divulgar eventos e proteger informações acadêmicas.
- **Equipe de desenvolvimento:** identificar as necessidades e definir as funcionalidades do sistema.

**Técnicas de elicitação:**
- **Entrevistas:** conversar com alunos e professores para entender suas dificuldades e necessidades.
- **Questionários:** coletar opiniões de vários usuários para identificar as funcionalidades mais importantes.

## 3. Análise e modelagem

**Requisitos funcionais (RF)**

- **RF01:** Permitir login para acessar informações acadêmicas restritas.
- **RF02:** Permitir que alunos consultem suas notas.
- **RF03:** Permitir que alunos consultem seus horários.
- **RF04:** Disponibilizar avisos acadêmicos.
- **RF05:** Permitir que professores publiquem materiais.
- **RF06:** Permitir a divulgação de eventos acadêmicos.

**Requisitos não funcionais (RNF)**

- **RNF01 — Desempenho:** 95% das consultas deverão responder em até 2 segundos, com até 200 usuários simultâneos.
- **RNF02 — Segurança:** impedir o acesso de pessoas não autorizadas às informações acadêmicas.
- **RNF03 — Usabilidade:** pelo menos 9 de 10 alunos deverão localizar suas notas em até 1 minuto, sem ajuda.

## 4. Negociação — MoSCoW

- **Must:** login, consulta de notas e horários, avisos e segurança, pois são essenciais para o funcionamento do sistema.
- **Should:** publicação de materiais, divulgação de eventos e metas de desempenho e usabilidade, pois melhoram a experiência dos usuários.
- **Could:** chat entre alunos e professores, por ser útil, mas não essencial.
- **Won't:** chat na primeira versão, para evitar atrasos e priorizar as funções principais.

## 5. Especificação de requisitos não funcionais

- **RNF01 — Rapidez:** 95% das consultas deverão responder em até 2 segundos. **Teste:** medir os tempos de resposta em um teste com acessos simultâneos.
- **RNF02 — Segurança:** informações restritas não poderão ser acessadas sem login. **Teste:** tentar acessar essas informações sem autenticação.
- **RNF03 — Facilidade de uso:** 9 de 10 alunos deverão localizar suas notas em até 1 minuto. **Teste:** observar os alunos realizando a tarefa e medir o tempo.

## 6. Validação

- **Revisão dos requisitos:** apresentar o documento aos alunos e professores para verificar se as necessidades foram atendidas.
- **Prototipação:** criar modelos das telas para que os usuários testem a navegação e indiquem melhorias.

Essas técnicas ajudam a identificar erros e corrigir os requisitos antes do desenvolvimento.

---

# Estudo de Caso 2 — PetCare

## 1. Elicitação e stakeholders

**Stakeholders:**
- **Tutores:** agendar consultas e receber lembretes de vacinação.
- **Veterinários:** consultar históricos e registrar diagnósticos e tratamentos.
- **Recepção:** controlar horários e confirmar ou cancelar consultas.
- **Gerência:** consultar relatórios de atendimentos.
- **Proprietário:** garantir que o sistema seja seguro e entregue em quatro meses.

**Técnicas de elicitação:**
- **Entrevistas:** conversar com os envolvidos para entender suas necessidades.
- **Observação:** acompanhar os agendamentos e a consulta às fichas para identificar dificuldades do processo atual.

## 2. Análise e concepção de requisitos

**Requisitos funcionais (RF)**

- **RF01:** Permitir o cadastro e login dos usuários.
- **RF02:** Permitir que tutores agendem consultas em horários disponíveis.
- **RF03:** Permitir que a recepção confirme e cancele consultas.
- **RF04:** Permitir que veterinários consultem e atualizem o histórico clínico dos animais.
- **RF05:** Enviar lembretes de vacinação aos tutores.
- **RF06:** Gerar relatórios da quantidade de atendimentos.

**Requisitos não funcionais (RNF)**

- **RNF01 — Desempenho:** 95% das consultas deverão responder em até 2 segundos, com até 100 usuários simultâneos.
- **RNF02 — Segurança:** restringir o acesso aos dados conforme as permissões de cada usuário.
- **RNF03 — Usabilidade:** 9 de 10 tutores deverão concluir um agendamento em até 2 minutos, sem ajuda.

## 3. Negociação com MoSCoW

- **Must:** cadastro e login, agendamento, controle da agenda e histórico clínico, pois são essenciais para o atendimento.
- **Should:** lembretes de vacinação, relatórios e metas de desempenho e usabilidade, pois melhoram o acompanhamento dos animais e a gestão.
- **Could:** pagamentos pelo aplicativo e chat com o veterinário, pois são úteis, mas podem aumentar o tempo de desenvolvimento.
- **Won't:** publicação de fotos dos animais na primeira versão, pois não é essencial para resolver os problemas atuais. Pagamentos e chat também serão adiados.

## 4. Especificação de requisitos não funcionais

- **RNF01 — Rapidez:** 95% das consultas deverão responder em até 2 segundos. **Teste:** medir o tempo de resposta com acessos simultâneos.
- **RNF02 — Segurança:** usuários sem permissão não poderão consultar ou alterar registros clínicos. **Teste:** tentar acessar esses registros com diferentes perfis.
- **RNF03 — Facilidade de uso:** 9 de 10 tutores deverão concluir um agendamento em até 2 minutos. **Teste:** observar os participantes e medir o tempo gasto.

## 5. Validação dos requisitos

- **Revisão dos requisitos:** apresentar o documento aos tutores e funcionários para identificar erros, omissões e divergências.
- **Prototipação:** criar telas de agendamento e histórico clínico para que os usuários avaliem se são fáceis de utilizar.

## 6. Desafio — Priorização da primeira versão

**1. Cadastro e login**
- **Necessidade:** identificar usuários e controlar o acesso.
- **Beneficiados:** tutores e funcionários.
- **Justificativa:** protege as informações.
- **Risco de adiamento:** acesso indevido aos dados.

**2. Agendamento de consultas**
- **Necessidade:** marcar consultas pelo celular.
- **Beneficiados:** tutores e recepção.
- **Justificativa:** reduz a dependência de telefone e WhatsApp.
- **Risco de adiamento:** manutenção dos processos manuais.

**3. Controle da agenda**
- **Necessidade:** organizar horários e cancelamentos.
- **Beneficiados:** recepção e veterinários.
- **Justificativa:** evita conflitos de horários.
- **Risco de adiamento:** desorganização dos atendimentos.

**4. Histórico clínico**
- **Necessidade:** reunir diagnósticos e tratamentos.
- **Beneficiados:** veterinários e tutores.
- **Justificativa:** facilita a consulta às informações dos animais.
- **Risco de adiamento:** continuidade do uso de fichas separadas.

**5. Lembretes de vacinação**
- **Necessidade:** lembrar os tutores das vacinas.
- **Beneficiados:** tutores e veterinários.
- **Justificativa:** ajuda a manter as vacinas em dia.
- **Risco de adiamento:** esquecimento das datas de vacinação.

**Funcionalidades adiadas:** os relatórios ficarão para uma versão futura, reduzindo temporariamente os recursos de gestão. Os pagamentos continuarão sendo realizados pelos meios atuais, o contato com veterinários seguirá pelos canais existentes e as fotos não estarão disponíveis. Essas funções poderão ser implementadas posteriormente.