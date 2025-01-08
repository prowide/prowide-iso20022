
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.008.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cclTx"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.008.001.05")
public class MxCamt00800105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CclTx", required = true)
    protected CancelTransactionV05 cclTx;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CancelTransactionV05 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, LongPaymentIdentification1 .class, MessageHeader2 .class, MxCamt00800105 .class, PaymentIdentification4Choice.class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PostalAddress6 .class, QueueTransactionIdentificationDetails.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ShortPaymentIdentification1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.008.001.05";

    public MxCamt00800105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00800105(final String xml) {
        this();
        MxCamt00800105 tmp = parse(xml);
        cclTx = tmp.getCclTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00800105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cclTx property.
     * 
     * @return
     *     possible object is
     *     {@link CancelTransactionV05 }
     *     
     */
    public CancelTransactionV05 getCclTx() {
        return cclTx;
    }

    /**
     * Sets the value of the cclTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelTransactionV05 }
     *     
     */
    public MxCamt00800105 setCclTx(CancelTransactionV05 value) {
        this.cclTx = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt00800105 parse(String xml) {
        return ((MxCamt00800105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00800105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00800105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00800105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00800105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00800105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00800105) parserImpl.read(MxCamt00800105 .class, xml, _classes));
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
     * Creates an MxCamt00800105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00800105 message
     * @return
     *     a new instance of MxCamt00800105
     */
    public static final MxCamt00800105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00800105 .class);
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

}
