package br.com.passagem.aerea.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.passagem.aerea.entity.Trecho;

@FacesConverter(forClass=Trecho.class)
public class TrechoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,String value) {
		if(value != null && !value.isEmpty()){
			return (Trecho)component.getAttributes().get(value);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,Object value) {
		if(value instanceof Trecho){
			Trecho entity =(Trecho)value;
			
			if (entity != null && entity instanceof Trecho && entity.getId() != null) {
				component.getAttributes().put(entity.getId().toString(), entity);
				return entity.getId().toString();
			}
		}
		return "";
	}

}
