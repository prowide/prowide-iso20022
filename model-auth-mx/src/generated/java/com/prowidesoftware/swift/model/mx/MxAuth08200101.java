
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
 * Class for auth.082.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invstrRgltryDataStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1auth.082.001.01")
public class MxAuth08200101
    extends AbstractMX
{

    @XmlElement(name = "InvstrRgltryDataStsAdvc", required = true)
    protected InvestorRegulatoryDataStatusAdvice invstrRgltryDataStsAdvc;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 82;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {InvestorRegulatoryDataStatusAdvice.class, MxAuth08200101 .class, OriginalBusinessQuery1 .class, SettlementConditionModificationProcessingStatus1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1auth.082.001.01";

    public MxAuth08200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08200101(final String xml) {
        this();
        MxAuth08200101 tmp = parse(xml);
        invstrRgltryDataStsAdvc = tmp.getInvstrRgltryDataStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invstrRgltryDataStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorRegulatoryDataStatusAdvice }
     *     
     */
    public InvestorRegulatoryDataStatusAdvice getInvstrRgltryDataStsAdvc() {
        return invstrRgltryDataStsAdvc;
    }

    /**
     * Sets the value of the invstrRgltryDataStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorRegulatoryDataStatusAdvice }
     *     
     */
    public MxAuth08200101 setInvstrRgltryDataStsAdvc(InvestorRegulatoryDataStatusAdvice value) {
        this.invstrRgltryDataStsAdvc = value;
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
    public static MxAuth08200101 parse(String xml) {
        return ((MxAuth08200101) MxReadImpl.parse(MxAuth08200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08200101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08200101) parserImpl.read(MxAuth08200101 .class, xml, _classes));
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
     * Creates an MxAuth08200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08200101 message
     * @return
     *     a new instance of MxAuth08200101
     */
    public final static MxAuth08200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth08200101 .class);
    }

}
