
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
 * The DTCCCACNSD1 message extends ISO corporate action cancellation advise (CACN) message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCACNSD1V02", propOrder = {
    "ntfctnXtnsn",
    "gnlInfXtnsn",
    "evtsLkgXtnsn",
    "xtrnlCmntsXtnsn"
})
public class DTCCCACNSD1V02 {

    @XmlElement(name = "NtfctnXtnsn")
    protected CorporateActionNotificationSD1 ntfctnXtnsn;
    @XmlElement(name = "GnlInfXtnsn")
    protected CorporateActionGeneralInformationSD2 gnlInfXtnsn;
    @XmlElement(name = "EvtsLkgXtnsn")
    protected List<CorporateActionCancellationSD1> evtsLkgXtnsn;
    @XmlElement(name = "XtrnlCmntsXtnsn")
    protected CorporateActionCancellationSD2 xtrnlCmntsXtnsn;

    /**
     * Gets the value of the ntfctnXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD1 }
     *     
     */
    public CorporateActionNotificationSD1 getNtfctnXtnsn() {
        return ntfctnXtnsn;
    }

    /**
     * Sets the value of the ntfctnXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD1 }
     *     
     */
    public DTCCCACNSD1V02 setNtfctnXtnsn(CorporateActionNotificationSD1 value) {
        this.ntfctnXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the gnlInfXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD2 }
     *     
     */
    public CorporateActionGeneralInformationSD2 getGnlInfXtnsn() {
        return gnlInfXtnsn;
    }

    /**
     * Sets the value of the gnlInfXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD2 }
     *     
     */
    public DTCCCACNSD1V02 setGnlInfXtnsn(CorporateActionGeneralInformationSD2 value) {
        this.gnlInfXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the evtsLkgXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtsLkgXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtsLkgXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionCancellationSD1 }
     * 
     * 
     */
    public List<CorporateActionCancellationSD1> getEvtsLkgXtnsn() {
        if (evtsLkgXtnsn == null) {
            evtsLkgXtnsn = new ArrayList<CorporateActionCancellationSD1>();
        }
        return this.evtsLkgXtnsn;
    }

    /**
     * Gets the value of the xtrnlCmntsXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellationSD2 }
     *     
     */
    public CorporateActionCancellationSD2 getXtrnlCmntsXtnsn() {
        return xtrnlCmntsXtnsn;
    }

    /**
     * Sets the value of the xtrnlCmntsXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellationSD2 }
     *     
     */
    public DTCCCACNSD1V02 setXtrnlCmntsXtnsn(CorporateActionCancellationSD2 value) {
        this.xtrnlCmntsXtnsn = value;
        return this;
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
     * Adds a new item to the evtsLkgXtnsn list.
     * @see #getEvtsLkgXtnsn()
     * 
     */
    public DTCCCACNSD1V02 addEvtsLkgXtnsn(CorporateActionCancellationSD1 evtsLkgXtnsn) {
        getEvtsLkgXtnsn().add(evtsLkgXtnsn);
        return this;
    }

}
