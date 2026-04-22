
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
 * Class for cafr.001.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "frdRptgInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafr.001.001.04")
public class MxCafr00100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FrdRptgInitn", required = true)
    protected FraudReportingInitiationV04 frdRptgInitn;
    public static final transient String BUSINESS_PROCESS = "cafr";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcquirerData1 .class, AdditionalFee4 .class, Address4 .class, AuthenticationMethod13Code.class, Authority1 .class, CardData17 .class, CardNotReceivedData1 .class, CardSecurityCapability2Code.class, Cardholder23 .class, CardholderName2 .class, ContactPersonal2 .class, ContentInformationType41 .class, Credentials3 .class, CreditDebit3Code.class, DestinationData1 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, FraudReportingAction2Code.class, FraudReportingInitiationV04 .class, FraudType2Code.class, FraudulentTransactionData4 .class, Header72 .class, IssuerData1 .class, Jurisdiction2 .class, LocalAddress1 .class, LocalAddress2 .class, LocalData20 .class, LocalData23 .class, LocalData24 .class, MACData1 .class, MxCafr00100104 .class, OriginatorData2 .class, ProgrammeMode6 .class, ProtectionMethod2Code.class, ReceiverData1 .class, Reconciliation5 .class, ReportedFraud6 .class, SenderData1 .class, SettlementService7 .class, StorageLocation2Code.class, Token4 .class, Token5 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafr.001.001.04";

    public MxCafr00100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafr00100104(final String xml) {
        this();
        MxCafr00100104 tmp = parse(xml);
        frdRptgInitn = tmp.getFrdRptgInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafr00100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the frdRptgInitn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportingInitiationV04 }
     *     
     */
    public FraudReportingInitiationV04 getFrdRptgInitn() {
        return frdRptgInitn;
    }

    /**
     * Sets the value of the frdRptgInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportingInitiationV04 }
     *     
     */
    public MxCafr00100104 setFrdRptgInitn(FraudReportingInitiationV04 value) {
        this.frdRptgInitn = value;
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
    public static MxCafr00100104 parse(String xml) {
        return ((MxCafr00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafr00100104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafr00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafr00100104 parse(String xml, MxRead parserImpl) {
        return ((MxCafr00100104) parserImpl.read(MxCafr00100104 .class, xml, _classes));
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
     * Creates an MxCafr00100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafr00100104 message
     * @return
     *     a new instance of MxCafr00100104
     */
    public static final MxCafr00100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafr00100104 .class);
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
