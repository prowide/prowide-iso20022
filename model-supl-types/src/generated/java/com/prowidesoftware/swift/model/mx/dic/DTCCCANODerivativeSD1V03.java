
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
 * The DTCCCANODerivativeSD1 message extends ISO corporate action notification (CANO) message with DTCC corporate action derivative notice elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCANODerivativeSD1V03", propOrder = {
    "corpActnNtfctn"
})
public class DTCCCANODerivativeSD1V03 {

    @XmlElement(name = "CorpActnNtfctn")
    protected List<CorporateActionNotificationSD2> corpActnNtfctn;

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnNtfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnNtfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionNotificationSD2 }
     * 
     * 
     */
    public List<CorporateActionNotificationSD2> getCorpActnNtfctn() {
        if (corpActnNtfctn == null) {
            corpActnNtfctn = new ArrayList<CorporateActionNotificationSD2>();
        }
        return this.corpActnNtfctn;
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
     * Adds a new item to the corpActnNtfctn list.
     * @see #getCorpActnNtfctn()
     * 
     */
    public DTCCCANODerivativeSD1V03 addCorpActnNtfctn(CorporateActionNotificationSD2 corpActnNtfctn) {
        getCorpActnNtfctn().add(corpActnNtfctn);
        return this;
    }

}
