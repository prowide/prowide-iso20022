
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides disclaimer narrative information about the event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateEventNarrative4", propOrder = {
    "dsclmr",
    "prcgTxtForNxtIntrmy"
})
public class CorporateEventNarrative4 {

    @XmlElement(name = "Dsclmr")
    protected List<LanguageSpecifiedNarrative1> dsclmr;
    @XmlElement(name = "PrcgTxtForNxtIntrmy")
    protected List<String> prcgTxtForNxtIntrmy;

    /**
     * Gets the value of the dsclmr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsclmr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsclmr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageSpecifiedNarrative1 }
     * 
     * 
     * @return
     *     The value of the dsclmr property.
     */
    public List<LanguageSpecifiedNarrative1> getDsclmr() {
        if (dsclmr == null) {
            dsclmr = new ArrayList<>();
        }
        return this.dsclmr;
    }

    /**
     * Gets the value of the prcgTxtForNxtIntrmy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prcgTxtForNxtIntrmy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgTxtForNxtIntrmy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the prcgTxtForNxtIntrmy property.
     */
    public List<String> getPrcgTxtForNxtIntrmy() {
        if (prcgTxtForNxtIntrmy == null) {
            prcgTxtForNxtIntrmy = new ArrayList<>();
        }
        return this.prcgTxtForNxtIntrmy;
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
     * Adds a new item to the dsclmr list.
     * @see #getDsclmr()
     * 
     */
    public CorporateEventNarrative4 addDsclmr(LanguageSpecifiedNarrative1 dsclmr) {
        getDsclmr().add(dsclmr);
        return this;
    }

    /**
     * Adds a new item to the prcgTxtForNxtIntrmy list.
     * @see #getPrcgTxtForNxtIntrmy()
     * 
     */
    public CorporateEventNarrative4 addPrcgTxtForNxtIntrmy(String prcgTxtForNxtIntrmy) {
        getPrcgTxtForNxtIntrmy().add(prcgTxtForNxtIntrmy);
        return this;
    }

}
