
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
 * The DTCCCASTSD1 message extends ISO corporate action instruction statement report message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCASTSD1V04", propOrder = {
    "evtBalDtls",
    "ttlInstdBalOptnBalDtls",
    "ttlInstdBalOptnInstrDtls",
    "ttlInstdBalOptnPrtctInstrDtls"
})
public class DTCCCASTSD1V04 {

    @XmlElement(name = "EvtBalDtls")
    protected CorporateActionBalanceSD5 evtBalDtls;
    @XmlElement(name = "TtlInstdBalOptnBalDtls")
    protected List<CorporateActionInstructedBalanceOptionBalanceSD3> ttlInstdBalOptnBalDtls;
    @XmlElement(name = "TtlInstdBalOptnInstrDtls")
    protected List<CorporateActionInstructedBalanceOptionInstructionSD3> ttlInstdBalOptnInstrDtls;
    @XmlElement(name = "TtlInstdBalOptnPrtctInstrDtls")
    protected List<CorporateActionInstructedBalanceOptionProtectInstructionSD4> ttlInstdBalOptnPrtctInstrDtls;

    /**
     * Gets the value of the evtBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalanceSD5 }
     *     
     */
    public CorporateActionBalanceSD5 getEvtBalDtls() {
        return evtBalDtls;
    }

    /**
     * Sets the value of the evtBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalanceSD5 }
     *     
     */
    public DTCCCASTSD1V04 setEvtBalDtls(CorporateActionBalanceSD5 value) {
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
     * {@link CorporateActionInstructedBalanceOptionBalanceSD3 }
     * 
     * 
     */
    public List<CorporateActionInstructedBalanceOptionBalanceSD3> getTtlInstdBalOptnBalDtls() {
        if (ttlInstdBalOptnBalDtls == null) {
            ttlInstdBalOptnBalDtls = new ArrayList<CorporateActionInstructedBalanceOptionBalanceSD3>();
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
     * {@link CorporateActionInstructedBalanceOptionInstructionSD3 }
     * 
     * 
     */
    public List<CorporateActionInstructedBalanceOptionInstructionSD3> getTtlInstdBalOptnInstrDtls() {
        if (ttlInstdBalOptnInstrDtls == null) {
            ttlInstdBalOptnInstrDtls = new ArrayList<CorporateActionInstructedBalanceOptionInstructionSD3>();
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
     * {@link CorporateActionInstructedBalanceOptionProtectInstructionSD4 }
     * 
     * 
     */
    public List<CorporateActionInstructedBalanceOptionProtectInstructionSD4> getTtlInstdBalOptnPrtctInstrDtls() {
        if (ttlInstdBalOptnPrtctInstrDtls == null) {
            ttlInstdBalOptnPrtctInstrDtls = new ArrayList<CorporateActionInstructedBalanceOptionProtectInstructionSD4>();
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
    public DTCCCASTSD1V04 addTtlInstdBalOptnBalDtls(CorporateActionInstructedBalanceOptionBalanceSD3 ttlInstdBalOptnBalDtls) {
        getTtlInstdBalOptnBalDtls().add(ttlInstdBalOptnBalDtls);
        return this;
    }

    /**
     * Adds a new item to the ttlInstdBalOptnInstrDtls list.
     * @see #getTtlInstdBalOptnInstrDtls()
     * 
     */
    public DTCCCASTSD1V04 addTtlInstdBalOptnInstrDtls(CorporateActionInstructedBalanceOptionInstructionSD3 ttlInstdBalOptnInstrDtls) {
        getTtlInstdBalOptnInstrDtls().add(ttlInstdBalOptnInstrDtls);
        return this;
    }

    /**
     * Adds a new item to the ttlInstdBalOptnPrtctInstrDtls list.
     * @see #getTtlInstdBalOptnPrtctInstrDtls()
     * 
     */
    public DTCCCASTSD1V04 addTtlInstdBalOptnPrtctInstrDtls(CorporateActionInstructedBalanceOptionProtectInstructionSD4 ttlInstdBalOptnPrtctInstrDtls) {
        getTtlInstdBalOptnPrtctInstrDtls().add(ttlInstdBalOptnPrtctInstrDtls);
        return this;
    }

}
