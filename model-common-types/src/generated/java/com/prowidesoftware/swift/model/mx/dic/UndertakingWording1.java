
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the wording for a demand guarantee, standby letter of credit or other undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingWording1", propOrder = {
    "mdlForm",
    "reqdWrdgLang",
    "udrtkgTermsAndConds"
})
public class UndertakingWording1 {

    @XmlElement(name = "MdlForm")
    protected ModelFormIdentification1 mdlForm;
    @XmlElement(name = "ReqdWrdgLang")
    protected String reqdWrdgLang;
    @XmlElement(name = "UdrtkgTermsAndConds")
    protected List<Narrative1> udrtkgTermsAndConds;

    /**
     * Gets the value of the mdlForm property.
     * 
     * @return
     *     possible object is
     *     {@link ModelFormIdentification1 }
     *     
     */
    public ModelFormIdentification1 getMdlForm() {
        return mdlForm;
    }

    /**
     * Sets the value of the mdlForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelFormIdentification1 }
     *     
     */
    public UndertakingWording1 setMdlForm(ModelFormIdentification1 value) {
        this.mdlForm = value;
        return this;
    }

    /**
     * Gets the value of the reqdWrdgLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdWrdgLang() {
        return reqdWrdgLang;
    }

    /**
     * Sets the value of the reqdWrdgLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndertakingWording1 setReqdWrdgLang(String value) {
        this.reqdWrdgLang = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgTermsAndConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udrtkgTermsAndConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUdrtkgTermsAndConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Narrative1 }
     * 
     * 
     */
    public List<Narrative1> getUdrtkgTermsAndConds() {
        if (udrtkgTermsAndConds == null) {
            udrtkgTermsAndConds = new ArrayList<Narrative1>();
        }
        return this.udrtkgTermsAndConds;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the udrtkgTermsAndConds list.
     * @see #getUdrtkgTermsAndConds()
     * 
     */
    public UndertakingWording1 addUdrtkgTermsAndConds(Narrative1 udrtkgTermsAndConds) {
        getUdrtkgTermsAndConds().add(udrtkgTermsAndConds);
        return this;
    }

}
