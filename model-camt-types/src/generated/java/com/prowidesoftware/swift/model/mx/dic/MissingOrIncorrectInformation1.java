
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates the reason for the UnableToApply. It can be missing and/or incorrect information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingOrIncorrectInformation1", propOrder = {
    "mssngInf",
    "incrrctInf"
})
public class MissingOrIncorrectInformation1 {

    @XmlElement(name = "MssngInf")
    @XmlSchemaType(name = "string")
    protected List<UnableToApplyMissingInfo1Code> mssngInf;
    @XmlElement(name = "IncrrctInf")
    @XmlSchemaType(name = "string")
    protected List<UnableToApplyIncorrectInfo2Code> incrrctInf;

    /**
     * Gets the value of the mssngInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mssngInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMssngInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnableToApplyMissingInfo1Code }
     * 
     * 
     */
    public List<UnableToApplyMissingInfo1Code> getMssngInf() {
        if (mssngInf == null) {
            mssngInf = new ArrayList<UnableToApplyMissingInfo1Code>();
        }
        return this.mssngInf;
    }

    /**
     * Gets the value of the incrrctInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incrrctInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncrrctInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnableToApplyIncorrectInfo2Code }
     * 
     * 
     */
    public List<UnableToApplyIncorrectInfo2Code> getIncrrctInf() {
        if (incrrctInf == null) {
            incrrctInf = new ArrayList<UnableToApplyIncorrectInfo2Code>();
        }
        return this.incrrctInf;
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
     * Adds a new item to the mssngInf list.
     * @see #getMssngInf()
     * 
     */
    public MissingOrIncorrectInformation1 addMssngInf(UnableToApplyMissingInfo1Code mssngInf) {
        getMssngInf().add(mssngInf);
        return this;
    }

    /**
     * Adds a new item to the incrrctInf list.
     * @see #getIncrrctInf()
     * 
     */
    public MissingOrIncorrectInformation1 addIncrrctInf(UnableToApplyIncorrectInfo2Code incrrctInf) {
        getIncrrctInf().add(incrrctInf);
        return this;
    }

}
