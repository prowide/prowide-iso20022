
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.008.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collPrpslRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.008.001.04")
public class MxColr00800104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollPrpslRspn", required = true)
    protected CollateralProposalResponseV04 collPrpslRspn;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, CashCollateralResponse1 .class, CollateralAccount2 .class, CollateralAccountIdentificationType2Choice.class, CollateralAccountType1Code.class, CollateralProposalResponse1Code.class, CollateralProposalResponse2 .class, CollateralProposalResponse2Choice.class, CollateralProposalResponseType2 .class, CollateralProposalResponseV04 .class, CollateralResponse1 .class, DateAndDateTimeChoice.class, ExposureType5Code.class, GenericAccountIdentification1 .class, GenericIdentification36 .class, MxColr00800104 .class, NameAndAddress6 .class, Obligation4 .class, OtherCollateralResponse1 .class, PartyIdentification100Choice.class, PostalAddress2 .class, RejectionReasonV021Code.class, SecuritiesCollateralResponse1 .class, Status4Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.008.001.04";

    public MxColr00800104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00800104(final String xml) {
        this();
        MxColr00800104 tmp = parse(xml);
        collPrpslRspn = tmp.getCollPrpslRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00800104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collPrpslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponseV04 }
     *     
     */
    public CollateralProposalResponseV04 getCollPrpslRspn() {
        return collPrpslRspn;
    }

    /**
     * Sets the value of the collPrpslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponseV04 }
     *     
     */
    public MxColr00800104 setCollPrpslRspn(CollateralProposalResponseV04 value) {
        this.collPrpslRspn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxColr00800104 parse(String xml) {
        return ((MxColr00800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00800104 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00800104 parse(String xml, MxRead parserImpl) {
        return ((MxColr00800104) parserImpl.read(MxColr00800104 .class, xml, _classes));
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
     * Creates an MxColr00800104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00800104 message
     * @return
     *     a new instance of MxColr00800104
     */
    public final static MxColr00800104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00800104 .class);
    }

}
