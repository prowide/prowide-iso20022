
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
 * The DTCCCANOCustodianSD1 message extends ISO corporate action notification (CANO) message with DTCC validation custodian service specific data elements that are not covered by the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCANOCustodianSD1V03", propOrder = {
    "ctdnDtls",
    "ctdnOptnDtDtls"
})
public class DTCCCANOCustodianSD1V03 {

    @XmlElement(name = "CtdnDtls")
    protected CustodianDetailsSD1 ctdnDtls;
    @XmlElement(name = "CtdnOptnDtDtls")
    protected List<CustodianOptionDateDetailsSD1> ctdnOptnDtDtls;

    /**
     * Gets the value of the ctdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CustodianDetailsSD1 }
     *     
     */
    public CustodianDetailsSD1 getCtdnDtls() {
        return ctdnDtls;
    }

    /**
     * Sets the value of the ctdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustodianDetailsSD1 }
     *     
     */
    public DTCCCANOCustodianSD1V03 setCtdnDtls(CustodianDetailsSD1 value) {
        this.ctdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the ctdnOptnDtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctdnOptnDtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtdnOptnDtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustodianOptionDateDetailsSD1 }
     * 
     * 
     */
    public List<CustodianOptionDateDetailsSD1> getCtdnOptnDtDtls() {
        if (ctdnOptnDtDtls == null) {
            ctdnOptnDtDtls = new ArrayList<CustodianOptionDateDetailsSD1>();
        }
        return this.ctdnOptnDtDtls;
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
     * Adds a new item to the ctdnOptnDtDtls list.
     * @see #getCtdnOptnDtDtls()
     * 
     */
    public DTCCCANOCustodianSD1V03 addCtdnOptnDtDtls(CustodianOptionDateDetailsSD1 ctdnOptnDtDtls) {
        getCtdnOptnDtDtls().add(ctdnOptnDtDtls);
        return this;
    }

}
