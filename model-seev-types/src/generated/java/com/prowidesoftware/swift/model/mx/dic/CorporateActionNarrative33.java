
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
 * Provides additional information such as the information to comply with.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative33", propOrder = {
    "infToCmplyWth",
    "dlvryDtls",
    "fxInstrsAddtlInf",
    "instrAddtlInf"
})
public class CorporateActionNarrative33 {

    @XmlElement(name = "InfToCmplyWth")
    protected List<String> infToCmplyWth;
    @XmlElement(name = "DlvryDtls")
    protected List<String> dlvryDtls;
    @XmlElement(name = "FXInstrsAddtlInf")
    protected List<String> fxInstrsAddtlInf;
    @XmlElement(name = "InstrAddtlInf")
    protected List<String> instrAddtlInf;

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infToCmplyWth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfToCmplyWth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInfToCmplyWth() {
        if (infToCmplyWth == null) {
            infToCmplyWth = new ArrayList<String>();
        }
        return this.infToCmplyWth;
    }

    /**
     * Gets the value of the dlvryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlvryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDlvryDtls() {
        if (dlvryDtls == null) {
            dlvryDtls = new ArrayList<String>();
        }
        return this.dlvryDtls;
    }

    /**
     * Gets the value of the fxInstrsAddtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxInstrsAddtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXInstrsAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFXInstrsAddtlInf() {
        if (fxInstrsAddtlInf == null) {
            fxInstrsAddtlInf = new ArrayList<String>();
        }
        return this.fxInstrsAddtlInf;
    }

    /**
     * Gets the value of the instrAddtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrAddtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInstrAddtlInf() {
        if (instrAddtlInf == null) {
            instrAddtlInf = new ArrayList<String>();
        }
        return this.instrAddtlInf;
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
     * Adds a new item to the infToCmplyWth list.
     * @see #getInfToCmplyWth()
     * 
     */
    public CorporateActionNarrative33 addInfToCmplyWth(String infToCmplyWth) {
        getInfToCmplyWth().add(infToCmplyWth);
        return this;
    }

    /**
     * Adds a new item to the dlvryDtls list.
     * @see #getDlvryDtls()
     * 
     */
    public CorporateActionNarrative33 addDlvryDtls(String dlvryDtls) {
        getDlvryDtls().add(dlvryDtls);
        return this;
    }

    /**
     * Adds a new item to the fXInstrsAddtlInf list.
     * @see #getFXInstrsAddtlInf()
     * 
     */
    public CorporateActionNarrative33 addFXInstrsAddtlInf(String fXInstrsAddtlInf) {
        getFXInstrsAddtlInf().add(fXInstrsAddtlInf);
        return this;
    }

    /**
     * Adds a new item to the instrAddtlInf list.
     * @see #getInstrAddtlInf()
     * 
     */
    public CorporateActionNarrative33 addInstrAddtlInf(String instrAddtlInf) {
        getInstrAddtlInf().add(instrAddtlInf);
        return this;
    }

}
