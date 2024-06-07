{{- define "my-spring-boot-app.name" -}}
{{- .Chart.Name -}}
{{- end -}}

{{- define "my-spring-boot-app.fullname" -}}
{{- include "my-spring-boot-app.name" . }}-{{ .Release.Name | replace "-" "" | trunc 63 | trimSuffix "-" }}
{{- end -}}

{{- define "my-spring-boot-app.chart" -}}
{{- .Chart.Name }}-{{ .Chart.Version }}
{{- end -}}
