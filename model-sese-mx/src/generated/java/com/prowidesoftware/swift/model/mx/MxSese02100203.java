
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.021.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxStsQry"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.021.002.03")
public class MxSese02100203
    extends AbstractMX
{

    @XmlElement(name = "SctiesTxStsQry", required = true)
    protected SecuritiesTransactionStatusQuery002V03 sctiesTxStsQry;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DocumentNumber11 .class, DocumentNumber2Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, Identification13 .class, MxSese02100203 .class, PartyIdentification51Choice.class, SecuritiesAccount17 .class, SecuritiesTransactionStatusQuery002V03 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.021.002.03";

    public MxSese02100203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02100203(final String xml) {
        this();
        MxSese02100203 tmp = parse(xml);
        sctiesTxStsQry = tmp.getSctiesTxStsQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02100203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxStsQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionStatusQuery002V03 }
     *     
     */
    public SecuritiesTransactionStatusQuery002V03 getSctiesTxStsQry() {
        return sctiesTxStsQry;
    }

    /**
     * Sets the value of the sctiesTxStsQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionStatusQuery002V03 }
     *     
     */
    public MxSese02100203 setSctiesTxStsQry(SecuritiesTransactionStatusQuery002V03 value) {
        this.sctiesTxStsQry = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese02100203 parse(String xml) {
        return ((MxSese02100203) MxReadImpl.parse(MxSese02100203 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02100203 parse(String xml, MxRead parserImpl) {
        return ((MxSese02100203) parserImpl.read(MxSese02100203 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSese02100203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02100203 message
     * @return
     *     a new instance of MxSese02100203
     */
    public final static MxSese02100203 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese02100203 .class);
    }

}
