
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for cain.006.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rvslRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.006.001.04")
public class MxCain00600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RvslRspn", required = true)
    protected ReversalResponseV04 rvslRspn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountDetails4 .class, Action16 .class, ActionDestination1Code.class, ActionType14Code.class, AdditionalAmounts4 .class, AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData13 .class, CertificateIssuer1 .class, ContactPersonal1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, Context22 .class, CreditDebit3Code.class, DateTime2 .class, DetailedAmount22 .class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData12 .class, ErrorDetails3 .class, GenericIdentification183 .class, Header71 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, LocalData14 .class, MACData1 .class, MessageClass1Code.class, MessageError1Code.class, MessageFunction16Code.class, MxCain00600104 .class, OriginalDataElements3 .class, OriginalTransactionAmounts3 .class, OriginalTransactionIdentification1 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification285 .class, PartyIdentification286 .class, PartyType17Code.class, PartyType18Code.class, PartyType26Code.class, PartyType32Code.class, PartyType34Code.class, PartyType9Code.class, ProcessingResult22 .class, ProgrammeMode5 .class, ProtectedData2 .class, ProtectionMethod1Code.class, PurchaseIdentifierType2Code.class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation4 .class, RelativeDistinguishedName1 .class, ReversalResponseV04 .class, SettlementService6 .class, SpecialProgrammeDetails2 .class, SpecialProgrammeQualification2 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal8 .class, Token2 .class, Traceability10 .class, Track2Data1Choice.class, TransactionAmounts3 .class, TransactionAttribute2Code.class, TransactionCharacteristics1 .class, TransactionIdentification57 .class, TransactionInitiator1Code.class, TypeOfAmount21Code.class, TypeOfAmount22Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.006.001.04";

    public MxCain00600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00600104(final String xml) {
        this();
        MxCain00600104 tmp = parse(xml);
        rvslRspn = tmp.getRvslRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rvslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalResponseV04 }
     *     
     */
    public ReversalResponseV04 getRvslRspn() {
        return rvslRspn;
    }

    /**
     * Sets the value of the rvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalResponseV04 }
     *     
     */
    public MxCain00600104 setRvslRspn(ReversalResponseV04 value) {
        this.rvslRspn = value;
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
    public static MxCain00600104 parse(String xml) {
        return ((MxCain00600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00600104 parse(String xml, MxRead parserImpl) {
        return ((MxCain00600104) parserImpl.read(MxCain00600104 .class, xml, _classes));
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
     * Creates an MxCain00600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00600104 message
     * @return
     *     a new instance of MxCain00600104
     */
    public final static MxCain00600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00600104 .class);
    }

}
