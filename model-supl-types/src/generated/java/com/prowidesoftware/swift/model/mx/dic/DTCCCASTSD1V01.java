
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
 * The DTCCCASTSD1 message extends ISO Corporate Action Instruction Statement Report message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCASTSD1V01", propOrder = {
    "evtBalDtls",
    "ttlInstdBalOptnBalDtls",
    "ttlInstdBalOptnInstrDtls",
    "ttlInstdBalOptnPrtctInstrDtls"
})
public class DTCCCASTSD1V01 {

    @XmlElement(name = "EvtBalDtls")
    protected CorporateActionBalanceSD2 evtBalDtls;
    @XmlElement(name = "TtlInstdBalOptnBalDtls")
    protected List<CorporateActionInstructedBalanceOptionBalanceDetailsSD1> ttlInstdBalOptnBalDtls;
    @XmlElement(name = "TtlInstdBalOptnInstrDtls")
    protected List<CorporateActionInstructedBalanceOptionInstructionDetailsSD1> ttlInstdBalOptnInstrDtls;
    @XmlElement(name = "TtlInstdBalOptnPrtctInstrDtls")
    protected List<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1> ttlInstdBalOptnPrtctInstrDtls;

    /**
     * Gets the value of the evtBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalanceSD2 }
     *     
     */
    public CorporateActionBalanceSD2 getEvtBalDtls() {
        return evtBalDtls;
    }

    /**
     * Sets the value of the evtBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalanceSD2 }
     *     
     */
    public DTCCCASTSD1V01 setEvtBalDtls(CorporateActionBalanceSD2 value) {
        this.evtBalDtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlInstdBalOptnBalDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlInstdBalOptnBalDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlInstdBalOptnBalDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionInstructedBalanceOptionBalanceDetailsSD1 }
     * 
     * 
     */
    public List<CorporateActionInstructedBalanceOptionBalanceDetailsSD1> getTtlInstdBalOptnBalDtls() {
        if (ttlInstdBalOptnBalDtls == null) {
            ttlInstdBalOptnBalDtls = new ArrayList<CorporateActionInstructedBalanceOptionBalanceDetailsSD1>();
        }
        return this.ttlInstdBalOptnBalDtls;
    }

    /**
     * Gets the value of the ttlInstdBalOptnInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlInstdBalOptnInstrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlInstdBalOptnInstrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionInstructedBalanceOptionInstructionDetailsSD1 }
     * 
     * 
     */
    public List<CorporateActionInstructedBalanceOptionInstructionDetailsSD1> getTtlInstdBalOptnInstrDtls() {
        if (ttlInstdBalOptnInstrDtls == null) {
            ttlInstdBalOptnInstrDtls = new ArrayList<CorporateActionInstructedBalanceOptionInstructionDetailsSD1>();
        }
        return this.ttlInstdBalOptnInstrDtls;
    }

    /**
     * Gets the value of the ttlInstdBalOptnPrtctInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlInstdBalOptnPrtctInstrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlInstdBalOptnPrtctInstrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 }
     * 
     * 
     */
    public List<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1> getTtlInstdBalOptnPrtctInstrDtls() {
        if (ttlInstdBalOptnPrtctInstrDtls == null) {
            ttlInstdBalOptnPrtctInstrDtls = new ArrayList<CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1>();
        }
        return this.ttlInstdBalOptnPrtctInstrDtls;
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
     * Adds a new item to the ttlInstdBalOptnBalDtls list.
     * @see #getTtlInstdBalOptnBalDtls()
     * 
     */
    public DTCCCASTSD1V01 addTtlInstdBalOptnBalDtls(CorporateActionInstructedBalanceOptionBalanceDetailsSD1 ttlInstdBalOptnBalDtls) {
        getTtlInstdBalOptnBalDtls().add(ttlInstdBalOptnBalDtls);
        return this;
    }

    /**
     * Adds a new item to the ttlInstdBalOptnInstrDtls list.
     * @see #getTtlInstdBalOptnInstrDtls()
     * 
     */
    public DTCCCASTSD1V01 addTtlInstdBalOptnInstrDtls(CorporateActionInstructedBalanceOptionInstructionDetailsSD1 ttlInstdBalOptnInstrDtls) {
        getTtlInstdBalOptnInstrDtls().add(ttlInstdBalOptnInstrDtls);
        return this;
    }

    /**
     * Adds a new item to the ttlInstdBalOptnPrtctInstrDtls list.
     * @see #getTtlInstdBalOptnPrtctInstrDtls()
     * 
     */
    public DTCCCASTSD1V01 addTtlInstdBalOptnPrtctInstrDtls(CorporateActionInstructedBalanceOptionProtectInstructionDetailsSD1 ttlInstdBalOptnPrtctInstrDtls) {
        getTtlInstdBalOptnPrtctInstrDtls().add(ttlInstdBalOptnPrtctInstrDtls);
        return this;
    }

}
